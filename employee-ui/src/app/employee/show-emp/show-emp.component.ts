import { Component, OnInit } from '@angular/core';
import { SharedService } from './../../shared.service';

@Component({
  selector: 'app-show-emp',
  templateUrl: './show-emp.component.html',
  styleUrls: ['./show-emp.component.css']
})
export class ShowEmpComponent implements OnInit {

  constructor(private service:SharedService) { }

  EmployeeList:any=[];

  ModalTitle:string="";
  ActivateAddEditEmpComp:boolean=false;
  emp:any;

  ngOnInit(): void {
    this.refreshEmployeeList();
  }

  addClick(){
    this.emp={
      employee_id:0,
      employee_name:"",
      department:"",
      date_of_joining:"",
      photo_file_name:""
    }
    this.ModalTitle="Add Employee";
    this.ActivateAddEditEmpComp=true;
  }

  editClick(item: any){
    this.emp=item;
    this.ModalTitle="Edit Employee";
    this.ActivateAddEditEmpComp=true;
  }

  deleteClick(item: any){
    if(confirm('Are you sure..??')){
      this.service.deleteEmployee(item.employee_id).subscribe(data=>{
        alert(data.toString());
        this.refreshEmployeeList();
      });

    }
  }

  closeClick(){
    this.ActivateAddEditEmpComp=false;
    this.refreshEmployeeList();
  }

  refreshEmployeeList(){
    this.service.getEmployee().subscribe(data=>{
      this.EmployeeList = data;
    });
  }

}
