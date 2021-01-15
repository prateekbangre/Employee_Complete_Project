import { Component, OnInit } from '@angular/core';

import { SharedService } from './../../shared.service';

@Component({
  selector: 'app-show-dep',
  templateUrl: './show-dep.component.html',
  styleUrls: ['./show-dep.component.css']
})
export class ShowDepComponent implements OnInit {

  constructor(private service:SharedService) { }

  DepartmentList:any=[];

  ModalTitle:string="";
  ActivateAddEditDepComp:boolean=false;
  dep:any;

  ngOnInit(): void {
    this.refreshDepartmentList();
  }

  addClick(){
    this.dep={
      department_id:0,
      department_name:""
    }
    this.ModalTitle="Add Department";
    this.ActivateAddEditDepComp=true;
  }

  editClick(item: any){
    this.dep=item;
    this.ModalTitle="Edit Department";
    this.ActivateAddEditDepComp=true;
  }

  deleteClick(item: any){
    if(confirm('Are you sure..??')){
      this.service.deleteDepartment(item.department_id).subscribe(data=>{
        alert(data.toString());
        this.refreshDepartmentList();
      });

    }
  }

  closeClick(){
    this.ActivateAddEditDepComp=false;
    this.refreshDepartmentList();
  }

  refreshDepartmentList(){
    this.service.getDepartment().subscribe(data=>{
      this.DepartmentList = data;
    });
  }

}
