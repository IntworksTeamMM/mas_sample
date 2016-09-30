/*
 * Copyright (C) 2011-2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * This file is auto-generated. DO NOT MODIFY!
 * The source Renderscript file: C:\\Users\\massa\\Documents\\app01\\yamas\\opencamera\\app\\src\\main\\rs\\process_hdr.rs
 */

package net.sourceforge.opencamera;

import android.renderscript.*;
import net.sourceforge.opencamera.process_hdrBitCode;

/**
 * @hide
 */
public class ScriptC_process_hdr extends ScriptC {
    private static final String __rs_resource_name = "process_hdr";
    // Constructor
    public  ScriptC_process_hdr(RenderScript rs) {
        super(rs,
              __rs_resource_name,
              process_hdrBitCode.getBitCode32(),
              process_hdrBitCode.getBitCode64());
        __ALLOCATION = Element.ALLOCATION(rs);
        mExportVar_parameter_A0 = 1.f;
        __F32 = Element.F32(rs);
        mExportVar_parameter_B0 = 0.f;
        mExportVar_parameter_A1 = 1.f;
        mExportVar_parameter_B1 = 0.f;
        mExportVar_parameter_A2 = 1.f;
        mExportVar_parameter_B2 = 0.f;
        mExportVar_weight_scale_c = 0.00778162247f;
        mExportVar_tonemap_scale = 1.f;
        __U8_4 = Element.U8_4(rs);
    }

    private Element __ALLOCATION;
    private Element __F32;
    private Element __U8_4;
    private FieldPacker __rs_fp_ALLOCATION;
    private FieldPacker __rs_fp_F32;
    private final static int mExportVarIdx_bitmap1 = 0;
    private Allocation mExportVar_bitmap1;
    public synchronized void set_bitmap1(Allocation v) {
        setVar(mExportVarIdx_bitmap1, v);
        mExportVar_bitmap1 = v;
    }

    public Allocation get_bitmap1() {
        return mExportVar_bitmap1;
    }

    public Script.FieldID getFieldID_bitmap1() {
        return createFieldID(mExportVarIdx_bitmap1, null);
    }

    private final static int mExportVarIdx_bitmap2 = 1;
    private Allocation mExportVar_bitmap2;
    public synchronized void set_bitmap2(Allocation v) {
        setVar(mExportVarIdx_bitmap2, v);
        mExportVar_bitmap2 = v;
    }

    public Allocation get_bitmap2() {
        return mExportVar_bitmap2;
    }

    public Script.FieldID getFieldID_bitmap2() {
        return createFieldID(mExportVarIdx_bitmap2, null);
    }

    private final static int mExportVarIdx_parameter_A0 = 2;
    private float mExportVar_parameter_A0;
    public synchronized void set_parameter_A0(float v) {
        setVar(mExportVarIdx_parameter_A0, v);
        mExportVar_parameter_A0 = v;
    }

    public float get_parameter_A0() {
        return mExportVar_parameter_A0;
    }

    public Script.FieldID getFieldID_parameter_A0() {
        return createFieldID(mExportVarIdx_parameter_A0, null);
    }

    private final static int mExportVarIdx_parameter_B0 = 3;
    private float mExportVar_parameter_B0;
    public synchronized void set_parameter_B0(float v) {
        setVar(mExportVarIdx_parameter_B0, v);
        mExportVar_parameter_B0 = v;
    }

    public float get_parameter_B0() {
        return mExportVar_parameter_B0;
    }

    public Script.FieldID getFieldID_parameter_B0() {
        return createFieldID(mExportVarIdx_parameter_B0, null);
    }

    private final static int mExportVarIdx_parameter_A1 = 4;
    private float mExportVar_parameter_A1;
    public synchronized void set_parameter_A1(float v) {
        setVar(mExportVarIdx_parameter_A1, v);
        mExportVar_parameter_A1 = v;
    }

    public float get_parameter_A1() {
        return mExportVar_parameter_A1;
    }

    public Script.FieldID getFieldID_parameter_A1() {
        return createFieldID(mExportVarIdx_parameter_A1, null);
    }

    private final static int mExportVarIdx_parameter_B1 = 5;
    private float mExportVar_parameter_B1;
    public synchronized void set_parameter_B1(float v) {
        setVar(mExportVarIdx_parameter_B1, v);
        mExportVar_parameter_B1 = v;
    }

    public float get_parameter_B1() {
        return mExportVar_parameter_B1;
    }

    public Script.FieldID getFieldID_parameter_B1() {
        return createFieldID(mExportVarIdx_parameter_B1, null);
    }

    private final static int mExportVarIdx_parameter_A2 = 6;
    private float mExportVar_parameter_A2;
    public synchronized void set_parameter_A2(float v) {
        setVar(mExportVarIdx_parameter_A2, v);
        mExportVar_parameter_A2 = v;
    }

    public float get_parameter_A2() {
        return mExportVar_parameter_A2;
    }

    public Script.FieldID getFieldID_parameter_A2() {
        return createFieldID(mExportVarIdx_parameter_A2, null);
    }

    private final static int mExportVarIdx_parameter_B2 = 7;
    private float mExportVar_parameter_B2;
    public synchronized void set_parameter_B2(float v) {
        setVar(mExportVarIdx_parameter_B2, v);
        mExportVar_parameter_B2 = v;
    }

    public float get_parameter_B2() {
        return mExportVar_parameter_B2;
    }

    public Script.FieldID getFieldID_parameter_B2() {
        return createFieldID(mExportVarIdx_parameter_B2, null);
    }

    private final static int mExportVarIdx_weight_scale_c = 8;
    private float mExportVar_weight_scale_c;
    public final static float const_weight_scale_c = 0.00778162247f;
    public float get_weight_scale_c() {
        return mExportVar_weight_scale_c;
    }

    public Script.FieldID getFieldID_weight_scale_c() {
        return createFieldID(mExportVarIdx_weight_scale_c, null);
    }

    private final static int mExportVarIdx_tonemap_scale = 9;
    private float mExportVar_tonemap_scale;
    public synchronized void set_tonemap_scale(float v) {
        setVar(mExportVarIdx_tonemap_scale, v);
        mExportVar_tonemap_scale = v;
    }

    public float get_tonemap_scale() {
        return mExportVar_tonemap_scale;
    }

    public Script.FieldID getFieldID_tonemap_scale() {
        return createFieldID(mExportVarIdx_tonemap_scale, null);
    }

    //private final static int mExportForEachIdx_root = 0;
    private final static int mExportForEachIdx_hdr = 1;
    public Script.KernelID getKernelID_hdr() {
        return createKernelID(mExportForEachIdx_hdr, 59, null, null);
    }

    public void forEach_hdr(Allocation ain, Allocation aout) {
        forEach_hdr(ain, aout, null);
    }

    public void forEach_hdr(Allocation ain, Allocation aout, Script.LaunchOptions sc) {
        // check ain
        if (!ain.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        // check aout
        if (!aout.getType().getElement().isCompatible(__U8_4)) {
            throw new RSRuntimeException("Type mismatch with U8_4!");
        }
        Type t0, t1;        // Verify dimensions
        t0 = ain.getType();
        t1 = aout.getType();
        if ((t0.getCount() != t1.getCount()) ||
            (t0.getX() != t1.getX()) ||
            (t0.getY() != t1.getY()) ||
            (t0.getZ() != t1.getZ()) ||
            (t0.hasFaces()   != t1.hasFaces()) ||
            (t0.hasMipmaps() != t1.hasMipmaps())) {
            throw new RSRuntimeException("Dimension mismatch between parameters ain and aout!");
        }

        forEach(mExportForEachIdx_hdr, ain, aout, null, sc);
    }

}

