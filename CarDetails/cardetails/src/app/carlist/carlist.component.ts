import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { HttpServiceService } from '../http-service.service';

@Component({
  selector: 'app-carlist',
  templateUrl: './carlist.component.html',
  styleUrls: ['./carlist.component.css']
})
export class CarlistComponent  implements OnInit {

  form: any = {
    id: null,
    list: [],
    search: {},
    message: '',
    deleteParams: {},
    preload: [],

  }

  constructor(private http: HttpServiceService, private router: Router, private httpc: HttpClient) { }
  ngOnInit(): void {

    this.search();
    this.preload();
  }

  search() {

    var self = this;

    this.http.post('http://localhost:8080/User/search', this.form.search, function (res: any) {
      //  self.form.list = res.result.data ;

      if (res.result.message) {
        self.form.message = res.result.message;
      }
      self.form.list = res.result.data;

    });
  }
  edit(page: any) {
    this.router.navigateByUrl(page)


  }

  onCheckboxChange(userId: number) {
    console.log('Checkbox with ID', userId, 'is checked/unchecked');
    this.form.id = userId;
    console.log("ids", this.form.id)
  }

  delete() {
    console.log("first ", this.form.id);
    var self = this;
    this.httpc.get('http://localhost:8080/User/delete/' + this.form.id).subscribe(
      (res: any) => {
        self.form.message = res.result.message;
        console.log('message => ', self.form.message);
        self.search();
      }
    )

  }

  preload() {
    var self = this;
    this.httpc.get("http://localhost:8080/User/preload").subscribe((res: any) => {
      self.form.preload = res.result.Carlist;

      console.log("preload>>>>>>", self.form.preload)
    })
  }

}


