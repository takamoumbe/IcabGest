// https://cdnjs.com/libraries/vue
let footer = document.getElementById('footer');
let langue = document.getElementById('langue');
let indexe = 0; // 0 french 1 english
let date1 = new Date();
let annee = date1.getFullYear();

footer.textContent = '© 2014 IcabGest '+annee;
french();
// translate to french
function french(){
	var arr = { 
		"title" : 'Bienvenue, svp connectez-vous', 
		"login" : 'Login', 
		"pass": 'Mot de Passe', 
		"forget-pass": 'Mot de passe oublié?', 
		"btn-log": 'Se Connecter', 
		"langue": 'English', 
		"propos": 'A propos', 
		"contact": 'Contact',
		"footer": '© '+annee+' IcabGest ',
	};

	for(var i in arr)
	{
		 document.getElementById(''+i).textContent = ""+arr[i];
	     document.getElementById(''+i).placeholder = ""+arr[i];
	}
}

// translate to french
function english(){
	var arr = { 
		"title" : 'Welcome, please log in', 
		"login" : 'Login', 
		"pass": 'Password', 
		"forget-pass": 'Forgot your password?', 
		"btn-log": 'Login', 
		"langue": 'French', 
		"propos": 'About', 
		"contact": 'Contact us',
		"footer": '© '+annee+' IcabGest ',
	};

	for(var i in arr)
	{
		 document.getElementById(''+i).textContent  = ""+arr[i];
		 document.getElementById(''+i).placeholder = ""+arr[i];
	     
	}
}

langue.addEventListener("click", function () {
    if ((indexe%2) == 0) {
    	french();
    	indexe++;
    }else{
    	english();
    	indexe++;
    }
 });





