package br.com.trabalho4pc3GeorgeAFAraujo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Cadastro")
public class CadastroServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String nome;
		String matricula;
		String idade;
		String sexo; 
		nome = req.getParameter("nome");
		matricula = req.getParameter("matricula");
		idade = req.getParameter("idade");
		sexo = req.getParameter("sexo");
		out.println("<html><head><title>Trabalho 4");
		out.println("</title></head><body style=\"margin-top:20px; margin-left:60px; margin-right:60px;\">");
		out.println("<h1 style=\"text-align:center\">Cadastro Realizado!!</h1>");
		out.println("<br><p><b>Aluno:</b> " + nome +"</p> ");
		out.println("<p><b>Matrícula:</b> " + matricula +"</p> ");
		out.println("<p><b>Idade:</b> " + idade +"</p> ");
		out.println("<p><b>Sexo:</b> " + sexo +"</p> ");
		
		if(sexo.equals("masculino") &&  Integer.parseInt(idade) >= 18) {
			out.println("<h2 style='text-align:center; color:red;'>Atenção!!</h2>");
			out.println("<p style='text-align:center'>Você precisa servir ao exército.</p>");
		}
		
		if(sexo.equals("masculino") &&  Integer.parseInt(idade) < 18) {
			out.println("<h2 style='text-align:center'>Atenção!!</h2>");
			out.println("<p style='text-align:center'>Você Está ok com as obrigações militares.</p>");
		}
		
		if(!sexo.equals("masculino")) {
			out.println("<h2 style='text-align:center'>Atenção!!</h2>");
			out.println("<p style='text-align:center'>Você não precisa servir ao exército.</p>");
		}
		
		
		out.println("<br></body></html>");
		out.close();
	}

}