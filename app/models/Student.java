package models;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;

import javax.persistence.Entity;


@Entity
public class Student extends Model{
    @Required
    @MaxSize(8)
    public String nameString;
    public String email;
    public String address;
    double tuition;

    @Override
    public String toString(){
        return  nameString;
    }

}
