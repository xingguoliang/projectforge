package org.projectforge.business.fibu.api;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import org.projectforge.business.fibu.EmployeeDO;
import org.projectforge.business.fibu.EmployeeTimedDO;
import org.projectforge.framework.persistence.api.IDao;
import org.projectforge.framework.persistence.api.IPersistenceService;
import org.projectforge.framework.persistence.api.ModificationStatus;

/**
 * Access to employee.
 *
 * @author Roger Rene Kommer (r.kommer.extern@micromata.de)
 */
public interface EmployeeService extends IPersistenceService<EmployeeDO>, IDao<EmployeeDO>
{
  void setPfUser(EmployeeDO employee, Integer userId);

  void setKost1(final EmployeeDO employee, final Integer kost1Id);

  EmployeeTimedDO addNewTimeAttributeRow(final EmployeeDO employee, final String groupName);

  EmployeeDO getEmployeeByUserId(final Integer userId);

  ModificationStatus updateAttribute(Integer userId, Object attribute, String attributeName);

  boolean isEmployeeActive(EmployeeDO employee);

  BigDecimal getMonthlySalary(EmployeeDO employee, Calendar selectedDate);

  Collection<EmployeeDO> findAllActive(boolean checkAccess);

  EmployeeDO getEmployeeByStaffnumber(String staffnumber);

  List<EmployeeDO> getAll(boolean checkAccess);
}