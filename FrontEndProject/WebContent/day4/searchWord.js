$(function () {
    //$("#word").on("keyup input paste change propertychange", function () { // 브라우저 별로 인식하는 이벤트가 다를 수도 있음
    $("#word").on("keyup input paste change", function () { // 입력칸에 글자 변화가 있으면
        // 1.입력한 칸의 값 알아내기
        var val = $(this).val();
        // 2. 입력한 값이 있다면... 비동기 요청(파라메터 이름은 word, 값)
        if (val.length > 0) {
            $.ajax({
                url: "searchWord.jsp",
                //dataType: 'json',
                data: { word: val },
                success: function (jsonStr) {
                    autoComplate(jsonStr);
                },
                error: function (xhr, status, error) {
                    console.error(status);
                    console.error(error)
                }
            });
        } else { // 3. 입력한 값이 없다면... (지워진경우)
            $("#popupPart").hide();
        }

    });
});

function autoComplate(jsonStr) {
    if (jsonStr.length > 0) {
        //var json = eval(jsonStr); // collection json의 경우에는 앞뒤로 "(", ")" 안넣어도 됨
        var json = eval("("+ jsonStr +")");
        if (json != null) {
            var msg = "";
            for (var i in json) {
                msg += json[i] + "<br>"
            }
            $("#popupPart").html('').html(msg).show();
        } else { // 3. 입력한 값이 없다면... (지워진경우)
            noData();
        }
    }
}

function noData() {
    $("#popupPart").html("<h3>no data</h3>" + "<br>");
    $("#popupPart h3").css("color", "red");
}