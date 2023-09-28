select machine_id, Round(avg(
  case
when activity_type="start" then timestamp
when activity_type="end" then -timestamp
end
)*(-2),3)as processing_time
from activity
group by machine_id