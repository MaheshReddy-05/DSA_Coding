select 
eui.unique_id as unique_id, e.name as name
from Employees e left join EmployeeUNI eui on e.id = eui.id