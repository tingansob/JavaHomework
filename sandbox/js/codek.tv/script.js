function substitute() {
  var myValue = document.getElementById('myTextBox').value;

  if (myValue == 0) {
    alert('Please enter a value in the text box!');
    return;
  }
  var myTitle = document.getElementById('title');
  myTitle.innerHTML = myValue;
}

function circle() {
    
}


