/**
 * 
 */
let xhr =new XMLHttpRequest();


window.onload= function()
{
	document.getElementById("btnsalary").addEventListener("click",CalculateSalary);
	document.getElementById("btnsalary2").addEventListener("click",CalculateSalary2);
}

function CalculateSalary()
{
	xhr.onload = funcionCallBack;
	let name = document.getElementById("txtname").value;
	let salary = document.getElementById("txtsalary").value;
	xhr.open("GET","CalculateSalaryservlet?txtname"+name+"&txtsalary="+salary);
	xhr.send(null);
}

function funcionCallBack()
{
	document.getElementById("SalaryCalculed").innerHTML = xhr.responseText;

}

function CalculateSalary2()
{
	xhr.onload = funcionCallBack2;
	let name2 = document.getElementById("txtname2").value;
	let salary2 = document.getElementById("txtsalary2").value;
	let miFormulario = new FormData();
	miFormulario.append("txtname",name2);
	miFormulario.append("txtsalary",salary2);
	xhr.open("POST","CalculateSalaryservlet2");
	xhr.send(miFormulario);
}

function funcionCallBack2()
{
	document.getElementById("SalaryCalculed2").innerHTML = xhr.responseText;

}