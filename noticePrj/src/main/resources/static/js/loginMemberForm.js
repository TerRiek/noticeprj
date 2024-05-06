function checkNull(){
	const id = document.querySelector("#id");
	if(id.value === ""){
		alert("아이디가 입력되지 않았습니다!");
		id.focus();
		return false;
	}
	const pw = document.querySelector("#pw");
	if(pw.value === ""){
		alert("비밀번호가 입력되지 않았습니다!");
		pw.focus();
		return false;
	}
	return true;
}