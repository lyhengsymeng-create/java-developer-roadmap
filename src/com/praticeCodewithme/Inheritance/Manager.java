package com.praticeCodewithme.Inheritance;

public class Manager extends Employee {
        private int  teamSize;

        public  Manager(){}
        public  Manager(int id, String name , double salary , String department,int teamSize){
            super(id, name , salary ,department);
            this.teamSize = teamSize;

        }
        public  void managerTeams(){
            System.out.println("Manager is managing  the teams");
        }
        public  void diplayInfo(){
            System.out.print("Team size " + teamSize);

        }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
