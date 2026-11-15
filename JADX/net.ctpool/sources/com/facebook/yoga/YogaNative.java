package com.facebook.yoga;

import com.facebook.soloader.SoLoader;

/* JADX INFO: loaded from: classes.dex */
@Q2.a
public class YogaNative {
    static {
        SoLoader.t("yoga");
    }

    static native void jni_YGConfigFreeJNI(long j7);

    static native int jni_YGConfigGetErrataJNI(long j7);

    static native long jni_YGConfigNewJNI();

    static native void jni_YGConfigSetErrataJNI(long j7, int i7);

    static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long j7, int i7, boolean z6);

    static native void jni_YGConfigSetLoggerJNI(long j7, YogaLogger yogaLogger);

    static native void jni_YGConfigSetPointScaleFactorJNI(long j7, float f7);

    static native void jni_YGConfigSetUseWebDefaultsJNI(long j7, boolean z6);

    static native void jni_YGNodeCalculateLayoutJNI(long j7, float f7, float f8, long[] jArr, YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    static native long jni_YGNodeCloneJNI(long j7);

    static native void jni_YGNodeCopyStyleJNI(long j7, long j8);

    static native void jni_YGNodeFinalizeJNI(long j7);

    static native void jni_YGNodeInsertChildJNI(long j7, long j8, int i7);

    static native boolean jni_YGNodeIsDirtyJNI(long j7);

    static native boolean jni_YGNodeIsReferenceBaselineJNI(long j7);

    static native void jni_YGNodeMarkDirtyJNI(long j7);

    static native long jni_YGNodeNewJNI();

    static native long jni_YGNodeNewWithConfigJNI(long j7);

    static native void jni_YGNodeRemoveAllChildrenJNI(long j7);

    static native void jni_YGNodeRemoveChildJNI(long j7, long j8);

    static native void jni_YGNodeResetJNI(long j7);

    static native void jni_YGNodeSetAlwaysFormsContainingBlockJNI(long j7, boolean z6);

    static native void jni_YGNodeSetHasBaselineFuncJNI(long j7, boolean z6);

    static native void jni_YGNodeSetHasMeasureFuncJNI(long j7, boolean z6);

    static native void jni_YGNodeSetIsReferenceBaselineJNI(long j7, boolean z6);

    static native void jni_YGNodeSetStyleInputsJNI(long j7, float[] fArr, int i7);

    static native int jni_YGNodeStyleGetAlignContentJNI(long j7);

    static native int jni_YGNodeStyleGetAlignItemsJNI(long j7);

    static native int jni_YGNodeStyleGetAlignSelfJNI(long j7);

    static native float jni_YGNodeStyleGetAspectRatioJNI(long j7);

    static native float jni_YGNodeStyleGetBorderJNI(long j7, int i7);

    static native int jni_YGNodeStyleGetDirectionJNI(long j7);

    static native int jni_YGNodeStyleGetDisplayJNI(long j7);

    static native long jni_YGNodeStyleGetFlexBasisJNI(long j7);

    static native int jni_YGNodeStyleGetFlexDirectionJNI(long j7);

    static native float jni_YGNodeStyleGetFlexGrowJNI(long j7);

    static native float jni_YGNodeStyleGetFlexJNI(long j7);

    static native float jni_YGNodeStyleGetFlexShrinkJNI(long j7);

    static native int jni_YGNodeStyleGetFlexWrapJNI(long j7);

    static native float jni_YGNodeStyleGetGapJNI(long j7, int i7);

    static native long jni_YGNodeStyleGetHeightJNI(long j7);

    static native int jni_YGNodeStyleGetJustifyContentJNI(long j7);

    static native long jni_YGNodeStyleGetMarginJNI(long j7, int i7);

    static native long jni_YGNodeStyleGetMaxHeightJNI(long j7);

    static native long jni_YGNodeStyleGetMaxWidthJNI(long j7);

    static native long jni_YGNodeStyleGetMinHeightJNI(long j7);

    static native long jni_YGNodeStyleGetMinWidthJNI(long j7);

    static native int jni_YGNodeStyleGetOverflowJNI(long j7);

    static native long jni_YGNodeStyleGetPaddingJNI(long j7, int i7);

    static native long jni_YGNodeStyleGetPositionJNI(long j7, int i7);

    static native int jni_YGNodeStyleGetPositionTypeJNI(long j7);

    static native long jni_YGNodeStyleGetWidthJNI(long j7);

    static native void jni_YGNodeStyleSetAlignContentJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetAlignItemsJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetAlignSelfJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetAspectRatioJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetBorderJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetDirectionJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetDisplayJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long j7);

    static native void jni_YGNodeStyleSetFlexBasisJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetFlexDirectionJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetFlexGrowJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetFlexJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetFlexShrinkJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetFlexWrapJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetGapJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetGapPercentJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetHeightAutoJNI(long j7);

    static native void jni_YGNodeStyleSetHeightJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetHeightPercentJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetJustifyContentJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetMarginAutoJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetMarginJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetMarginPercentJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetMaxHeightJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMaxWidthJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMinHeightJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMinHeightPercentJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMinWidthJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetMinWidthPercentJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetOverflowJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetPaddingJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetPaddingPercentJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetPositionJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetPositionPercentJNI(long j7, int i7, float f7);

    static native void jni_YGNodeStyleSetPositionTypeJNI(long j7, int i7);

    static native void jni_YGNodeStyleSetWidthAutoJNI(long j7);

    static native void jni_YGNodeStyleSetWidthJNI(long j7, float f7);

    static native void jni_YGNodeStyleSetWidthPercentJNI(long j7, float f7);

    static native void jni_YGNodeSwapChildJNI(long j7, long j8, int i7);
}
