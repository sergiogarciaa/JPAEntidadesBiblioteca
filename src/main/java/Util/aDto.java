/*
 * package Util;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException; import
 * java.util.ArrayList;
 * 
 * import Entidades.Usuarios;
 * 
 * public class aDto {
 *//**
	 * Conversion a DTO
	 * 
	 * @param resultadoConsulta
	 * @return
	 *//*
		 * public ArrayList<Usuarios> resultsALibrosDto(ResultSet resultadoConsulta) {
		 * ArrayList<Usuarios> listaUsuarios = new ArrayList<Usuarios>();
		 * 
		 * //Leemos el resultado de la consulta hasta que no queden filas try { while
		 * (resultadoConsulta.next()) {
		 * 
		 * listaUsuarios.add(new Usuarios(resultadoConsulta.getLong("id_usuario"),
		 * resultadoConsulta.getString("titulo"), resultadoConsulta.getString("autor"),
		 * resultadoConsulta.getString("isbn"), resultadoConsulta.getInt("edicion")) );
		 * }
		 * 
		 * int i = listaUsuarios.size();
		 * System.out.println("[INFORMACIÓN-ADto-resultsALibrosDto] Número libros: " +
		 * i);
		 * 
		 * } catch (SQLException e) { System.out.
		 * println("[ERROR-ADto-resultsALibrosDto] Error al pasar el result set a lista de LibroDto"
		 * + e); }
		 * 
		 * return listaUsuarios; } }
		 */