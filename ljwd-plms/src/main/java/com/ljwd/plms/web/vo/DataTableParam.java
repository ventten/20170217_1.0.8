package com.ljwd.plms.web.vo;

import java.util.List;

/**
 * Created by zhengzw on 2016/6/13 0013.
 * 前端分页插件的请求参数封装
 */
public class DataTableParam {

    private int sEcho;                      //请求次数
    private int iDisplayStart;              //起始记录数,用于计算页数,第一条为0
    private int iDisplayLength;             //每页记录数
    private int iColumns;                   //列数
    private List<String> mDataProps;        //列的Name列表
    private List<Boolean> bSortables;       //列对应是否能排序
    private int iSortingCols;               //排序列的个数
    private List<Integer> iSortCols;        //排序列的编号
    private List<String> iSortColsName;     //排序列的名称
    private List<String> sSortDirs;         //排布列排序形式 Asc/Desc

    public DataTableParam() {

    }

    public DataTableParam(int sEcho, int iDisplayStart, int iDisplayLength) {
        super();
        this.sEcho = sEcho;
        this.iDisplayStart = iDisplayStart;
        this.iDisplayLength = iDisplayLength;
    }

    public DataTableParam(int sEcho, int iDisplayStart, int iDisplayLength, int iColumns, List<String> mDataProps, List<Boolean> bSortables, int iSortingCols, List<Integer> iSortCols, List<String> iSortColsName, List<String> sSortDirs) {
        this.sEcho = sEcho;
        this.iDisplayStart = iDisplayStart;
        this.iDisplayLength = iDisplayLength;
        this.iColumns = iColumns;
        this.mDataProps = mDataProps;
        this.bSortables = bSortables;
        this.iSortingCols = iSortingCols;
        this.iSortCols = iSortCols;
        this.iSortColsName = iSortColsName;
        this.sSortDirs = sSortDirs;
    }

	public int getsEcho() {
        return sEcho;
    }

    public void setsEcho(int sEcho) {
        this.sEcho = sEcho;
    }

    public int getiDisplayStart() {
        return iDisplayStart;
    }

    public void setiDisplayStart(int iDisplayStart) {
        this.iDisplayStart = iDisplayStart;
    }

    public int getiDisplayLength() {
        return iDisplayLength;
    }

    public void setiDisplayLength(int iDisplayLength) {
        this.iDisplayLength = iDisplayLength;
    }

    public int getiColumns() {
        return iColumns;
    }

    public void setiColumns(int iColumns) {
        this.iColumns = iColumns;
    }

    public List<String> getmDataProps() {
        return mDataProps;
    }

    public void setmDataProps(List<String> mDataProps) {
        this.mDataProps = mDataProps;
    }

    public List<Boolean> getbSortables() {
        return bSortables;
    }

    public void setbSortables(List<Boolean> bSortables) {
        this.bSortables = bSortables;
    }

    public int getiSortingCols() {
        return iSortingCols;
    }

    public void setiSortingCols(int iSortingCols) {
        this.iSortingCols = iSortingCols;
    }

    public List<Integer> getiSortCols() {
        return iSortCols;
    }

    public void setiSortCols(List<Integer> iSortCols) {
        this.iSortCols = iSortCols;
    }

    public List<String> getiSortColsName() {
        return iSortColsName;
    }

    public void setiSortColsName(List<String> iSortColsName) {
        this.iSortColsName = iSortColsName;
    }

    public List<String> getsSortDirs() {
        return sSortDirs;
    }

    public void setsSortDirs(List<String> sSortDirs) {
        this.sSortDirs = sSortDirs;
    }

}
