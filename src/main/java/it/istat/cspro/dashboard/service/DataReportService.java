package it.istat.cspro.dashboard.service;

import it.istat.cspro.dashboard.dao.*;
import it.istat.cspro.dashboard.domain.*;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Istat Cooperation Unit
 */
@Service
public class DataReportService {

    @Autowired
    private RIndividualInfoDao rIndividualInfoDao;
    @Autowired
    private RSexByAgeDao rSexByAgeDao;
    @Autowired
    private RSexByAgeGroupDao rSexByAgeGroupDao;
    @Autowired
    private RQuestionnaireInfoDao rQuestionnaireInfoDao;
    @Autowired
    private RRegionalAreaDao rRegionalAreaDao;
    @Autowired
    private RReligionDao rReligionDao;

    public RIndividualInfo getPopulationReport() {
        return rIndividualInfoDao.findAll().get(0);
    }

    public RQuestionnaireInfo getQuestionnaireReport() {
        return rQuestionnaireInfoDao.findAll().get(0);
    }

    public RRegionalArea getRegionalEAReport() {
        return rRegionalAreaDao.findEA();
    }

    public List<RSexByAge> getSexByAgeReport() {
        return rSexByAgeDao.findAll();
    }

    public List<RSexByAgeGroup> getSexByAgeGroupReport() {
        return rSexByAgeGroupDao.findAll();
    }

    public List<RReligion> getReligionReport() {
        return rReligionDao.findAll();
    }

}
