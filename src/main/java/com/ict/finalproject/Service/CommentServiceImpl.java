package com.ict.finalproject.Service;

import com.ict.finalproject.DAO.CommentDAO;
import com.ict.finalproject.DAO.CommuDAO;
import com.ict.finalproject.vo.CommentVO;
import com.ict.finalproject.vo.CommuVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDAO commentDAO;


    @Override
    public int insertComment(CommentVO comment) {
        return commentDAO.insertComment(comment);
    }

    @Override
    public int updateCommnet(CommentVO comment) {
        return commentDAO.updateCommnet(comment);
    }

    @Override
    public int deleteComment(int idx) {
        return commentDAO.deleteComment(idx);
    }

    @Override
    public int updeteReport() {
        return 0;
    }
}
