<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%><%
String searchWord[]={"a","ab","abc","abcd","b","bb","bee","bear","can","campus"}; 	
String outString = "";	    
String word = request.getParameter("word").toLowerCase(); 
System.out.println(word);

outString="[";
for(int i=0; i<searchWord.length; i++){
	if(searchWord[i].startsWith(word)){
		outString+= "'"+searchWord[i] + "',";
	}
}
if(outString.equals("[")){
	outString=null;
	
}else{
	int len = outString.length();
	outString = outString.substring(0, len-1);
	outString += "]";
}    
    out.print(outString); //client로 결과를 보내주는 부분
    System.out.println(outString);//console

%>