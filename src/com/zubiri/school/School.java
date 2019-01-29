package com.zubiri.school;

import java.util.ArrayList;

public class School {
	
	private ArrayList<Administrative> administratives = new ArrayList<Administrative>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<Student> students = new ArrayList<Student>();
	private String schoolName = "";

	public School(String schoolName){
		this.schoolName=schoolName;
	}
	
	public void setSchoolName(String schoolName) {
		this.schoolName=schoolName;
	}
	public String getSchoolName() {
		return schoolName;
	}
	
	//ADMINISTRATIVES MANAGEMENT
	
	public ArrayList<Administrative> getAdministratives(){
		return administratives;
	}
	public void setAdministratives(ArrayList<Administrative> administratives) {
		this.administratives = administratives;
	}
	public Administrative getAdministrative(int index) {
		return administratives.get(index);
	}
	public void addAdministrative(Administrative administrative) {
		generateID(administrative);
		administratives.add(administrative);
	}
	public int findAdministrative(String administrativeID) {
		for(int i = 0; i<administratives.size();i++) 
			if(administratives.get(i).getAdministrativeID().matches(administrativeID))
				return i;
		return -1;
	}
	public void deleteAdministrative(int index) {
		administratives.remove(index);
	}
	public void modifyAdministrative(int index, Administrative administrative) {
		administratives.add(index, administrative);
	}
	public void generateID(Administrative administrative) {
		administrative.setAdministrativeID("A"+(administratives.size()+1));
	}
	
	//TEACHERS MANAGEMENT
	
	public ArrayList<Teacher> getTeachers(){
		return teachers;
	}
	public void setTeachers(ArrayList<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Teacher getTeacher(int index) {
		return teachers.get(index);
	}
	public void addTeacher(Teacher teacher) {
		generateID(teacher);
		teachers.add(teacher);
	}
	public int findTeacher(String teacherID) {
		for(int i = 0; i<teachers.size();i++) 
			if(teachers.get(i).getTeacherID().matches(teacherID))
				return i;
		return -1;
	}
	public void deleteTeacher(int index) {
		teachers.remove(index);
	}
	public void modifyTeacher(int index, Teacher teacher) {
		teachers.add(index, teacher);
	}
	public void generateID(Teacher teacher) {
		teacher.setTeacherID("T"+(teachers.size()+1));
	}
	
	//STUDENTS MANAGEMENT
	
	public ArrayList<Student> getStudents(){
		return students;
	}
	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	public Student getStudent(int index) {
		return students.get(index);
	}
	public void addStudent(Student student) {
		generateID(student);
		students.add(student);
	}
	public int findStudent(String studentID) {
		for(int i = 0; i<students.size();i++) 
			if(students.get(i).getStudentID().matches(studentID))
				return i;
		return -1;
	}
	public void deleteStudent(int index) {
		students.remove(index);
	}
	public void modifyStudent(int index, Student student) {
		students.add(index, student);
	}
	public void generateID(Student student) {
		student.setStudentID("S"+(students.size()+1));
	}
	
	/**
	 * 
	 * @param classroom you want to find the tutor of
	 * @return position of the teacher object with that classroom assigned in tutor
	 */
	public int tutorOf(String classroom) {
		for(int i=0;i<teachers.size();i++) {
			if(teachers.get(i).isTutor())
				return i;
		}
		return -1;
	}
}
