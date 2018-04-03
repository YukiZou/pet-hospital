package com.ecnu.service.impl;

import com.ecnu.dao.DepDrugDao;
import com.ecnu.entity.DepDrug;
import com.ecnu.service.DepDrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepDrugServiceImpl implements DepDrugService {
    @Autowired
    private DepDrugDao depDrugDao;
    @Override
    public List<DepDrug> findDepDrugsByDepId(int depId) {
        DepDrug depDrug = new DepDrug();
        depDrug.setDepartment_id(depId);
        return depDrugDao.queryDepDrugs(depDrug);
    }

    @Override
    public void deleteDepDrugs(DepDrug depDrug) {
        depDrugDao.deleteDepDrug(depDrug);
    }
}
