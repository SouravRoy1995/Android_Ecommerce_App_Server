package edmt.dev.androidecomserver.Common;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;

import edmt.dev.androidecomserver.Model.Request;
import edmt.dev.androidecomserver.Model.User;
import edmt.dev.androidecomserver.Remote.IGeoCoordinates;
import edmt.dev.androidecomserver.Remote.RetrofitClient;

/**
 * Created by User on 1/5/2018.
 */

public class Common {
    public static User currentUser;
    public static Request currentRequest;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static final String baseUrl = "https://maps.googleapis.com";

    public static String convertCodeToStatus(String code)
    {

        if(code.equals("0"))
            return "Placed";

        else if(code.equals("1"))
            return "Placed,1 day to shipped";

        else if(code.equals("2"))
            return "Placed,2 day to shipped";

        else if(code.equals("3"))
            return "Placed,1 week to shipped";

        else if(code.equals("4"))
            return "Placed,2 week to shipped";

        else if(code.equals("5"))
            return "On my way,1 hour to shipped";

        else if(code.equals("6"))
            return "On my way,2 hour to shipped";

        else if(code.equals("7"))
            return "On my way,3 hour to shipped";

        else if(code.equals("8"))
            return "On my way,4 hour to shipped";

        else if(code.equals("9"))
            return "On my way, 6 hour to shipped";

        else if(code.equals("10"))
            return "On my way,10 hour to shipped";

        else
            return "Shipped";
    }

    public static IGeoCoordinates getGeoCodeService(){
        return RetrofitClient.getClient(baseUrl).create(IGeoCoordinates.class);

    }

    public static Bitmap scaleBitmap(Bitmap bitmap, int newWidth,int newHeight)
    {
        Bitmap scaledBitmap = Bitmap.createBitmap(newWidth,newHeight,Bitmap.Config.ARGB_8888);

        float scaleX = newWidth/(float)bitmap.getWidth();
        float scaleY = newHeight/(float)bitmap.getHeight();
        float pivotX=0,pivotY=0;

        Matrix scaleMatrix = new Matrix();
        scaleMatrix.setScale(scaleX,scaleY,pivotX,pivotY);

        Canvas canvas = new Canvas(scaledBitmap);
        canvas.setMatrix(scaleMatrix);
        canvas.drawBitmap(bitmap,0,0,new Paint(Paint.FILTER_BITMAP_FLAG));


        return scaledBitmap;
    }

}
