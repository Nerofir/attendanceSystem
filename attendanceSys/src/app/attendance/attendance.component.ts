import { Component, OnInit } from '@angular/core';
import { AttModel } from '../attmodel';
import { AttendanceService } from '../attendance.service';

@Component({
  selector: 'app-attendance',
  templateUrl: './attendance.component.html',
  styleUrls: ['./attendance.component.css']
})
export class AttendanceComponent implements OnInit {
    listAttendance: AttModel[];
    selectedAtt: AttModel;

  constructor(private attendanceService: AttendanceService) { }

  ngOnInit() {
    this.getListAttendance();
  }

  getListAttendance() : void {
    this.attendanceService.getListAttendance()
    .subscribe(listAttendance => this.listAttendance = listAttendance)
  }
  
  onSelect(att: AttModel): void {
    this.selectedAtt = att;
  }
}
