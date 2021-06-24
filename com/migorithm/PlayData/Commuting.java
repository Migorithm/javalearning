package com.migorithm.PlayData;

public class Commuting {
    private Boolean at_home;
    private Boolean at_work;

    Commuting(Boolean at_home, Boolean at_work){
        this.at_home = at_home;
        this.at_work = at_work;
    }

    public void is_going(){
        if(this.at_home){
            System.out.println("Sorry, I haven't even left for work.");
            setAt_home(false);
        }
        else if (!this.at_home && (!this.at_work)){
            System.out.println("Sorry, I'm on my way");
            setAt_work(true);}


        else if(!this.at_home && (this.at_work)){
            System.out.println("Hey~! I arrived!");

        }
    }

    public Boolean getAt_home() {
        return at_home;
    }
    public void setAt_home(Boolean at_home) {
        this.at_home = at_home;
    }
    public Boolean getAt_work() {
        return at_work;
    }
    public void setAt_work(Boolean at_work) {
        this.at_work = at_work;
    }



}
