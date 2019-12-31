package models;

import play.*;
import play.db.jpa.*;
import play.data.validation.*;
import javax.persistence.*;
import java.util.*;
@Entity
public class Postgraduate extends Model {
    @Required
    @MaxSize(8)
    public String nameString;
    public double tuition;
    public String address;

    @Override
    public String toString(){
        return  nameString;
    }
}