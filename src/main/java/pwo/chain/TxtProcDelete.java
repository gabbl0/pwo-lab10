package pwo.chain;

public class TxtProcDelete extends TxtProc {

    public static String ACTION = "DELETE";

    @Override
    public String processRequest(Request request) {

        if (request.action.toUpperCase().equals(ACTION)) {
            return request.text.replaceAll("[0123456789]","");
        } else
            return next(request);
    }
}