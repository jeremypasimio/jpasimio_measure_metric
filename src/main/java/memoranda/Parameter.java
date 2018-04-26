package main.java.memoranda;

import main.java.memoranda.date.CalendarDate;
//TASK 2-1 SMELL WITHIN A CLASS
//This class is part of solution for 2-1.
public class Parameter {  

  int type;
  int period;
  int hh;
  int mm;
  CalendarDate startDate;
  CalendarDate endDate;  
  String text;
  boolean workDays;
  
  public Parameter() {
    
  }
  
  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public int getPeriod() {
    return period;
  }

  public void setPeriod(int period) {
    this.period = period;
  }

  public int getHh() {
    return hh;
  }

  public void setHh(int hh) {
    this.hh = hh;
  }

  public int getMm() {
    return mm;
  }

  public void setMm(int mm) {
    this.mm = mm;
  }

  public CalendarDate getStartDate() {
    return startDate;
  }

  public void setStartDate(CalendarDate startDate) {
    this.startDate = startDate;
  }

  public CalendarDate getEndDate() {
    return endDate;
  }

  public void setEndDate(CalendarDate endDate) {
    this.endDate = endDate;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public boolean isWorkDays() {
    return workDays;
  }

  public void setWorkDays(boolean workDays) {
    this.workDays = workDays;
  }

}
