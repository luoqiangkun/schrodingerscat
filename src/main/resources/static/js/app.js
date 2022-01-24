
let holder = false;
document.getElementById('todoBtn').addEventListener('click', function (){
    if(holder){
        return;
    }
    this.className += " disabled";
    let xhr = new XMLHttpRequest();
    xhr.open('GET','open');
    xhr.responseType = 'json';
    xhr.onreadystatechange = function() {
        if (xhr.readyState == 4) {
            let response = xhr.response;
            if(response.data.status){
                document.getElementById('scBox').innerHTML = "<img src='../image/cute-cat.jpeg' />";
            }else{
                document.getElementById('scBox').innerHTML = "<img src='../image/dead-cat.jpeg' />";
            }
        }
    }
    xhr.send();
}, false);
document.getElementById("resetBtn").addEventListener("click",function (){
    holder = false;
    let parentElement = document.getElementById('scBox');
    let childElement = parentElement.getElementsByTagName("img")[0];
    if(childElement){
        parentElement.removeChild(childElement);
    }
    document.getElementById('todoBtn').classList.remove("disabled");
},false);