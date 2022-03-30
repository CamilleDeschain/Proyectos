import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title: string = 'Angular Crud';
  msg: string = '';
  employees = [
    { 'name': 'Fernando', 'position': 'Manager', 'email': 'a@gmail.com' },
    { 'name': 'Camille', 'position': 'Musician', 'email': 'b@gmail.com' },
    { 'name': 'Roland', 'position': 'Gunslinger', 'email': 'c@gmail.com' }
  ];

  model: any = {};
  model2: any = {};
  hideUpdate:boolean=true;
  addEmployee(): void {
    this.employees.push(this.model);
    this.model = {}
    this.msg = 'Campo Agregado'
  }
  deleteEmployee(i): void {
    var answet = confirm("Estas Seguro?");
    if (answet) {
      this.employees.splice(i, 1);
    }
    this.msg='campo eliminado'
  }
  myValue;
  editEmployee(i): void {
    this.hideUpdate=false;
    this.model2.name = this.employees[i].name;
    this.model2.position = this.employees[i].position;
    this.model2.email = this.employees[i].email;
    this.myValue = i;
    this.msg='Editar Campo'
  }
  updateEmployee(): void {
    let i = this.myValue;
    for (let j=0; j < this.employees.length; j++) {
      if (i == j) {
        this.employees[i] = this.model2;
        this.msg='campo actualizado'
        this.model2 = {};
      }
    }
  }
  closeAlert() {
    this.msg = ''
  }
}
