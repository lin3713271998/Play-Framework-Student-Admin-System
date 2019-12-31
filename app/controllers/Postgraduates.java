package controllers;

import models.Postgraduate;
import play.mvc.With;

@With(Secure.class)
public class Postgraduates extends CRUD {
    public static void modifyName(String id){
        Postgraduate object = Postgraduate.findById(Long.parseLong(id));
        if (object != null){
            render("@changename", object);
        }
    }
    public static void doModifyName(Postgraduate object){
        Postgraduate st = Postgraduate.findById(object.id);
        if (object.nameString != null) {
            // 保存新名字
            st.nameString = object.nameString;
            st.save();
            render("@modifynamedone", object);
        }
    }
}
