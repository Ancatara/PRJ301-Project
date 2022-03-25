const panels = document.querySelectorAll('.panel')

panels.forEach(panel =>{
    panel.addEventListener('click', ()=>{
        removeActiveClasses()
        panel.classList.add('active')
    })
})

function removeActiveClasses(){
    panels.forEach(panel => {
        panel.classList.remove('active')
    })
}

//Search
//const search = document.querySelector('.search')
//const input = document.querySelector('.input')
//const btn = document.querySelector('.search-button')
//
//btn.addEventListener('click', ()=>{
//    search.classList.toggle('active')
//    input.focus()
//})

//login
const labels =document.querySelectorAll('.form-control label')
 
labels.forEach(label =>{
    label.innerHTML = label.innerText
            .split('')
            .map((letter, idx)=> `<span>${letter}</span>`)
            .join('')
})

const name = document.getElementById('name')
const password = document.getElementById('password')
const form = document.getElementById('form')
const errorElement = document.getElementById('error')
const rePassword = document.getElementById('rePassword')
const email = document.getElementById('email')

form.addEventListener('submit', (e) =>{
    let messages = []
    if (name.value === '' || name.value == null) {
        alert('Name is required')
    }
     
    if (password.value.length <= 6) {
        alert('Password must be longer than 6 character')
    }
    if (password.value.length >= 20) {
        alert('Password must be less than 6 character')
    }
    if (rePassword.value !== password.value ) {
        alert('Re-password not match password')
    }
    if (messages.length > 0) {
        e.preventDefault()
        errorElement.innerText = messages.join(', ')
    }
    else{
        alert('Register Successful')
    }
}
    )
