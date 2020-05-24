package lecture1.jdbc2;

import lecture1.util.StringUtil;

public class ProfessorService {

    static final String ID_필수 = "ID를 입력하세요";
    static final String 성함_필수 = "성함을 입력하세요";
    static final String ID_중복 = "ID가 중복됩니다";


    public static String validate(Professor professor) throws Exception {
        if (StringUtil.isEmptyOrBlank(String.valueOf(professor.getId())))
            return ID_필수;
        if (StringUtil.isEmptyOrBlank(professor.getProfessorName()))
            return 성함_필수;
        Professor professor1 = ProfessorDAO.findById(professor.getId());
        if (professor1 != null && professor1.getId() != professor.getId())
            return ID_중복;
        return null;
    }
    public static String validateBeforeInsert(Professor professor) throws Exception {
        String errorMessage = validate(professor);
        if (errorMessage != null) return errorMessage;
        if (ProfessorDAO.findById(professor.getId()) != null)
            return "ID가 중복됩니다.";
        return null;
    }

    public static String insert(Professor professor) throws Exception {
        String errorMessage = validate(professor);
        if (errorMessage != null) return errorMessage;
        ProfessorDAO.insert(professor);
        return null;
    }

    public static String update(Professor professor) throws Exception {
        String errorMessage = validate(professor);
        if (errorMessage != null) return errorMessage;
        ProfessorDAO.update(professor);
        return null;
    }
}
