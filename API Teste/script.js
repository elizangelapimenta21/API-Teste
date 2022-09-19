const formulario = document.querySelector("form")
const Iid = document.querySelector(".id")
const Inome = document.querySelector(".nome")
const Icpf = document.querySelector(".cpf")
const Idate = document.querySelector(".date")
const Iemail = document.querySelector(".email")

function cadastrar() {

    fetch("http://localhost:8080/pessoas", 
    {
        headers: {
            'Accept':'application/json'
        },
        method:"POST",
        body: JSON.stringify({
            id: Iid.value,
            nome: Inome.value,
            cpf: Icpf.value,
            email: Iemail.value,
        })
        
    })
    .then(function (res) {console.log(res) })
    .catch(function (res) {console.log(res) })

};

function limpar(){
    Iid.value = "";
    Inome.value = "";
    Icpf.value = "";
    Iemail.value = "";

};


formulario.addEventListener('submit', function (event) {
    event.preventDefault();
    
    cadastrar();
    limpar();
});
