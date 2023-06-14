/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.teis.ud2.model.dao.proyecto;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

import es.teis.rud2.data.DBCPDataSourceFactory;
import es.teis.rud2.exceptions.InstanceNotFoundException;
import es.teis.rud2.model.Proyecto;
import es.teis.ud2.model.dao.AbstractGenericDao;

/**
 *
 * @author mfernandez
 */
public class ProyectoSQLServerDao extends AbstractGenericDao<Proyecto> implements IProyectoDao {

	private DataSource dataSource;

	public ProyectoSQLServerDao() {
		this.dataSource = DBCPDataSourceFactory.getDataSource();
	}

	@Override
	public Proyecto create(Proyecto proyecto) {
		return null;
	}

	@Override
	public Proyecto read(int id) throws InstanceNotFoundException {
		return null;
	}

	@Override
	public boolean update(Proyecto proyecto) {
		return false;
	}

	@Override
	public boolean delete(int id) {
		return false;

	}

	@Override
	public ArrayList<Proyecto> findAll() {
		return findAllProjectsByTable("project");

	}

	public boolean transferir(int projno) {
		// TO DO
		return false;
	}

	@Override
	public ArrayList<Proyecto> findAllSpecial() {
		return findAllProjectsByTable("project_special");
	}

	private ArrayList<Proyecto> findAllProjectsByTable(String tableName) {
		ArrayList<Proyecto> proyectos = new ArrayList<>();
		// TO DO
		return proyectos;
	}
}
