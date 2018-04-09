import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/observable/of';
import { catchError, map, tap } from 'rxjs/operators';

import { AttModel } from './attmodel';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
};

@Injectable()
export class AttendanceService {

  private attendanceUrl = 'http://localhost:8080/attendanceSystem/attendance/all';  // URL to web api
 private attendanceForOneUser = 'http://localhost:8080/attendanceSystem/attendance/';
  constructor(
    private http: HttpClient) { }

  getListAttendance(): Observable<AttModel[]> {
      return this.http.get<AttModel[]>(this.attendanceUrl);
  }

  getOneUserAttendance(id: number): Observable<AttModel[]> {
      const url = `${this.attendanceForOneUser}${id}`;
      return this.http.get<AttModel[]>(url);
  }
}


