import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, Validators } from "@angular/forms";

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  constructor(private formBuilder: FormBuilder, private http: HttpClient) { }

  get name() {
    return this.regForm.get("name");
  }

  get surname() {
    return this.regForm.get("surname");
  }

  get email() {
    return this.regForm.get("email");
  }

  get password() {
    return this.regForm.get("password");
  }

  public errorMessages = {
    name: [
      { type: 'required', message: 'Name is required' },
      { type: 'maxlength', message: 'Name cant be longer than 100 characters' }
    ],
    surname: [
      { type: 'required', message: 'Surame is required' },
      { type: 'maxlength', message: 'Name cant be longer than 100 characters' }
    ],
    email: [
      { type: 'required', message: 'Email is required' },
      { type: 'pattern', message: 'Please enter a valid email address' }
    ],
    phone: [
      { type: 'required', message: 'Phone number is required' },
      { type: 'pattern', message: 'Please enter a valid phone number' }
    ],
  };

  regForm = this.formBuilder.group({
    name: ['', [Validators.required, Validators.maxLength(100)]],
    surname: ['', [Validators.required, Validators.maxLength(100)]],
    email: [
      '',
      [
        Validators.required,
        Validators.pattern('^[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,4}$')
      ]
    ],
    password: ['']
  });

  public submit() {


    /*     let body = new FormData();
        body.append('name', this.regForm.get("name").value);
        body.append('surname', this.regForm.get("surname").value);
        body.append('email', this.regForm.get("email").value);
        body.append('password', this.regForm.get("password").value); */


    let headers = new HttpHeaders()
      .set('content-type', 'application/json');


    let body = JSON.stringify({
      name: this.regForm.get("name").value,
      surname: this.regForm.get("surname").value,
      email: this.regForm.get("email").value,
      password: this.regForm.get("password").value
    });

    console.log(body);

    this.http.post("http://localhost:8080/api/reg/create/", body, { headers }).subscribe((res) => {
      console.log(res);
    })
  }

  public print() {
    this.http.get("https://reqres.in/api/users?page=2").subscribe((res) => {
      console.log(res);
    });
  }
}
