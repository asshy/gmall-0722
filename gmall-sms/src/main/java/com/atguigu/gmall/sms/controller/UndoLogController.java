package com.atguigu.gmall.sms.controller;

import java.util.Arrays;
import java.util.Map;


import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;
import com.atguigu.core.bean.Resp;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gmall.sms.entity.UndoLogEntity;
import com.atguigu.gmall.sms.service.UndoLogService;




/**
 * 
 *
 * @author yangdaoquan
 * @email 97394797@qq.com
 * @date 2020-04-14 16:09:07
 */
@Api(tags = " 管理")
@RestController
@RequestMapping("sms/undolog")
public class UndoLogController {
    @Autowired
    private UndoLogService undoLogService;

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('sms:undolog:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = undoLogService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('sms:undolog:info')")
    public Resp<UndoLogEntity> info(@PathVariable("id") Long id){
		UndoLogEntity undoLog = undoLogService.getById(id);

        return Resp.ok(undoLog);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('sms:undolog:save')")
    public Resp<Object> save(@RequestBody UndoLogEntity undoLog){
		undoLogService.save(undoLog);

        return Resp.ok(null);
    }

    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('sms:undolog:update')")
    public Resp<Object> update(@RequestBody UndoLogEntity undoLog){
		undoLogService.updateById(undoLog);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('sms:undolog:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
		undoLogService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
