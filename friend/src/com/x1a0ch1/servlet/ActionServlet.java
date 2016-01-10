package com.x1a0ch1.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.x1a0ch1.DAO.Pic;
import com.x1a0ch1.DAO.PicDAOimpl;
import com.x1a0ch1.DAO.User;
import com.x1a0ch1.DAO.UserDAOimpl;
import com.x1a0ch1.DAO.UserDAOimpl;

public class ActionServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ActionServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		this.doPost(request, response);
	}
	


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String servletPath = request.getServletPath();
		String methodName = servletPath.substring(1);
		methodName = methodName.substring(0, methodName.length() - 3);

		try {
			// 利用反射 获取methodName 对应的方法
			Method method = getClass().getDeclaredMethod(methodName, HttpServletRequest.class,
					HttpServletResponse.class);
			// 利用反射调用对应的方法
			method.invoke(this, request, response);

		} catch (Exception e) {
			response.sendRedirect("error.jsp");

		}
//		// 获取类的全路径以及名称
//		  String className = request.getParameter("className");
//		  // 获取方法名
//		  String methodName = request.getParameter("method");
//		  try {
//		   // 获取class文件
//		   Class<?> t_class = Class.forName(className);
//		   // 获取该类所需求的方法
//		   Method method = t_class.getDeclaredMethod(methodName,
//		     HttpServletRequest.class, HttpServletResponse.class);
//		   method.invoke(t_class.newInstance(), request, response);// 方法的实现
//		  } catch (Exception e) {
//		   e.printStackTrace();
//		  }

	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}
	
	public void login(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				String username=request.getParameter("username");
				String pwd=request.getParameter("pwd");
				UserDAOimpl dao=new UserDAOimpl();
				try {
					User user=dao.findByUsername(username);
					if(user!=null && user.getPwd().equals(pwd)){
						HttpSession session=request.getSession();
						session.setAttribute("user", user);
						response.sendRedirect("list.do");
					}else{
						request.setAttribute("login_error", "用户名或密码错误");
						request.getRequestDispatcher("login.jsp").forward(request,response);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
	public void list(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			UserDAOimpl dao=new UserDAOimpl();
			try {
				List<User> users=dao.findAll();
				request.setAttribute("users", users);
				request.getRequestDispatcher("user_list.jsp").forward(request, response);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		
		
	}
	public void newUser(HttpServletRequest request,HttpServletResponse response)
			throws ServletException, IOException{
		
		User user=new User();
		UserDAOimpl dao=new UserDAOimpl();
		String username=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String phone=request.getParameter("phone");
		String ask=request.getParameter("ask");
		user.setUsername(username);
		user.setPwd(pwd);
		user.setName(name);
		user.setGender(gender);
		user.setAge(age);
		user.setAsk(ask);
		user.setPhone(phone);
		try {
			dao.addUser(user);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void userDetail(HttpServletRequest request,HttpServletResponse response){
		int id=Integer.parseInt(request.getParameter("id"));
		User user=null;
		Pic pic=null;
		UserDAOimpl dao=new UserDAOimpl();
		PicDAOimpl pdao=new PicDAOimpl();
		try {
			user=dao.findById(id);
			pic=pdao.findByUserid(id);
			request.setAttribute("user", user);
			request.setAttribute("pic", pic);
			request.getRequestDispatcher("user_info.jsp").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void logout(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
		
	}

}
