SELECT st.student_id,st.student_name,s.subject_name,count(e.student_id) as attended_exams 
from students st cross join subjects s 
Left join Examinations e 
on e.student_id=st.student_id and s.subject_name=e.subject_name 
group by st.student_id,s.subject_name 
order by student_id,subject_name