
function checkNull() {
	const id = document.querySelector("#id");
	if (id.value === "") {
		alert("아이디가 입력되지 않았습니다!");
		id.focus();
		return false;
	}
	const idResult = document.querySelector("#idResult");
	if(idResult.innerHTML !== "사용 가능한 아이디입니다!"){
		alert("사용 가능한 아이디를 입력해주세요!");
		id.focus();
		return false;
	}
	const pw = document.querySelector("#pw");
	if (pw.value === "") {
		alert("비밀번호가 입력되지 않았습니다!");
		pw.focus();
		return false;
	}
	const name = document.querySelector("#name");
	if (name.value === "") {
		alert("이름이 입력되지 않았습니다!");
		name.focus();
		return false;
	}
	const tel = document.querySelector("#tel");
	if (tel.value === "") {
		alert("전화번호가 입력되지 않았습니다!");
		tel.focus();
		return false;
	}
	const email = document.querySelector("#email");
	if (email.value === "") {
		alert("이메일이 입력되지 않았습니다!");
		email.focus();
		return false;
	}
	return true;
}

function checkId(){
	const id = document.querySelector("#id");
	const xhr = new XMLHttpRequest();
	xhr.onload = function(){
		if(this.responseText !== ""){
			document.querySelector("#idResult").innerHTML = this.responseText;
		}
	}
	xhr.open("POST", "/member/checkValidId?id=" + id.value, true);
	xhr.send();
}

function checkAgain(){
	document.querySelector("#idResult").innerHTML = "";
}