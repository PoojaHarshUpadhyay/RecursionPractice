public String reverseString(String str, int counter) {

if(str.isEmpty()){
return str;
}

if (counter == str.length()) {
return str;
}

counter = counter+1;

return reverseString(str.substring(1)+str.chatAt(0), counter);


}
