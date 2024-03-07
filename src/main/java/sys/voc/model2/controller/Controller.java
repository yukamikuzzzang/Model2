package sys.voc.model2.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Controller {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
