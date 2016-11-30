package edu.curso.mb;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.curso.dao.ConsoleDAO;
import edu.curso.dao.ConsoleDAOImpl;
import edu.curso.entidade.Console;

@ManagedBean
@SessionScoped
public class consoleMB {

	private Console consoleAtual;
	private String mensagem;
	private ConsoleDAO cDao;
	private List<Console> consoles;
	private List<Console> lista = new ArrayList<Console>();

	public consoleMB() {
		consoleAtual = new Console();
		cDao = new ConsoleDAOImpl();

	}

	// private ConsoleDAO consoleDao = new ConsoleDAOImpl();
	// private Console consoleAtual = new Console();

	public String adicionar()  {
		cDao.adicionar(consoleAtual);
		setmensagem("Gravado com sucesso");
		consoleAtual = new Console();
		return "";
	}

	public String pesquisar() {
		lista = cDao.pesquisarPorNome(consoleAtual.getNome());
		if (lista != null && lista.size() > 0) {
			consoleAtual = lista.get(0);
		}
		return "";
	}

	public void deletar( Console c) {
		try 
		{
			cDao.deletar(c);
			consoleAtual = new Console();
			//pesquisarTudo();
			setmensagem("Removido Com Sucesso!");
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	public String logout() {		
		int x = 0;
		if(x == x){
			return "login";
		}else{
			
		}
		return "login";
		
	}

	public void alterar() {
		try {
			cDao.alterar(consoleAtual);
			setmensagem("Alterado com sucesso");
			consoleAtual = new Console();
			//pesquisar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Console getconsole() {
		return consoleAtual;
	}

	public void setconsole(Console console) {
		this.consoleAtual = console;
	}

	public List<Console> getLista() {
		return lista;
	}

	public void setLista(List<Console> lista) {
		this.lista = lista;
	}

	public Console getConsoleAtual() {
		return consoleAtual;
	}

	public void setConsoleAtual(Console consoleAtual) {
		this.consoleAtual = consoleAtual;
	}

	public String getmensagem() {
		return mensagem;
	}

	public void setmensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public ConsoleDAO getcDao() {
		return cDao;
	}

	public void setcDao(ConsoleDAO cDao) {
		this.cDao = cDao;
	}

	public List<Console> getConsoles() {
		return consoles;
	}

	public void setConsoles(List<Console> consoles) {
		this.consoles = consoles;
	}
}
