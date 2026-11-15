.class public Lcom/facebook/react/views/image/ReactImageManager;
.super Lcom/facebook/react/uimanager/SimpleViewManager;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/SimpleViewManager<",
        "Lcom/facebook/react/views/image/h;",
        ">;"
    }
.end annotation

.annotation runtime Li2/a;
    name = "RCTImageView"
.end annotation


# static fields
.field public static final REACT_CLASS:Ljava/lang/String; = "RCTImageView"


# instance fields
.field private final mCallerContext:Ljava/lang/Object;

.field private final mCallerContextFactory:Lcom/facebook/react/views/image/f;

.field private mDraweeControllerBuilder:Lg1/b;

.field private mGlobalImageLoadListener:Lcom/facebook/react/views/image/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->mDraweeControllerBuilder:Lg1/b;

    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->mCallerContext:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg1/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageManager;->mDraweeControllerBuilder:Lg1/b;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageManager;->mCallerContext:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg1/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/SimpleViewManager;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/image/ReactImageManager;->mDraweeControllerBuilder:Lg1/b;

    iput-object p3, p0, Lcom/facebook/react/views/image/ReactImageManager;->mCallerContext:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lg1/b;Lcom/facebook/react/views/image/f;)V
    .locals 1

    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(Lg1/b;Lcom/facebook/react/views/image/a;Lcom/facebook/react/views/image/f;)V

    return-void
.end method

.method public constructor <init>(Lg1/b;Ljava/lang/Object;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0, p2}, Lcom/facebook/react/views/image/ReactImageManager;-><init>(Lg1/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic createViewInstance(Lcom/facebook/react/uimanager/e0;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/facebook/react/views/image/ReactImageManager;->createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/image/h;

    move-result-object p1

    return-object p1
.end method

.method public createViewInstance(Lcom/facebook/react/uimanager/e0;)Lcom/facebook/react/views/image/h;
    .locals 4

    .line 2
    invoke-virtual {p0}, Lcom/facebook/react/views/image/ReactImageManager;->getCallerContext()Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Lcom/facebook/react/views/image/h;

    invoke-virtual {p0}, Lcom/facebook/react/views/image/ReactImageManager;->getDraweeControllerBuilder()Lg1/b;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v1, p1, v2, v3, v0}, Lcom/facebook/react/views/image/h;-><init>(Landroid/content/Context;Lg1/b;Lcom/facebook/react/views/image/a;Ljava/lang/Object;)V

    return-object v1
.end method

.method public getCallerContext()Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->mCallerContext:Ljava/lang/Object;

    return-object v0
.end method

.method public getDraweeControllerBuilder()Lg1/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->mDraweeControllerBuilder:Lg1/b;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lc1/c;->i()Lc1/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->mDraweeControllerBuilder:Lg1/b;

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/views/image/ReactImageManager;->mDraweeControllerBuilder:Lg1/b;

    .line 12
    .line 13
    return-object v0
.end method

.method public getExportedCustomDirectEventTypeConstants()Ljava/util/Map;
    .locals 12

    invoke-super {p0}, Lcom/facebook/react/uimanager/BaseViewManager;->getExportedCustomDirectEventTypeConstants()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_0
    const/4 v1, 0x4

    invoke-static {v1}, Lcom/facebook/react/views/image/b;->g(I)Ljava/lang/String;

    move-result-object v2

    const-string v1, "onLoadStart"

    const-string v3, "registrationName"

    invoke-static {v3, v1}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const/4 v4, 0x5

    invoke-static {v4}, Lcom/facebook/react/views/image/b;->g(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "onProgress"

    invoke-static {v3, v5}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const/4 v6, 0x2

    invoke-static {v6}, Lcom/facebook/react/views/image/b;->g(I)Ljava/lang/String;

    move-result-object v6

    const-string v7, "onLoad"

    invoke-static {v3, v7}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x1

    invoke-static {v8}, Lcom/facebook/react/views/image/b;->g(I)Ljava/lang/String;

    move-result-object v8

    const-string v9, "onError"

    invoke-static {v3, v9}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v9

    const/4 v10, 0x3

    invoke-static {v10}, Lcom/facebook/react/views/image/b;->g(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "onLoadEnd"

    invoke-static {v3, v11}, LS1/f;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v11

    move-object v3, v1

    invoke-static/range {v2 .. v11}, LS1/f;->h(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    const-string v0, "RCTImageView"

    return-object v0
.end method

.method protected bridge synthetic onAfterUpdateTransaction(Landroid/view/View;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/image/h;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/image/ReactImageManager;->onAfterUpdateTransaction(Lcom/facebook/react/views/image/h;)V

    return-void
.end method

.method protected onAfterUpdateTransaction(Lcom/facebook/react/views/image/h;)V
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/facebook/react/uimanager/BaseViewManager;->onAfterUpdateTransaction(Landroid/view/View;)V

    invoke-virtual {p1}, Lcom/facebook/react/views/image/h;->o()V

    return-void
.end method

.method public setAccessible(Lcom/facebook/react/views/image/h;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "accessible"
    .end annotation

    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    return-void
.end method

.method public setBlurRadius(Lcom/facebook/react/views/image/h;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "blurRadius"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setBlurRadius(F)V

    return-void
.end method

.method public setBorderColor(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "borderColor"
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setBorderColor(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setBorderRadius(Lcom/facebook/react/views/image/h;IF)V
    .locals 1
    .annotation runtime Lx2/b;
        defaultFloat = NaNf
        names = {
            "borderRadius",
            "borderTopLeftRadius",
            "borderTopRightRadius",
            "borderBottomRightRadius",
            "borderBottomLeftRadius"
        }
    .end annotation

    invoke-static {p3}, Lcom/facebook/yoga/g;->a(F)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p3}, Lcom/facebook/react/uimanager/G;->d(F)F

    move-result p3

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p1, p3}, Lcom/facebook/react/views/image/h;->setBorderRadius(F)V

    goto :goto_0

    :cond_1
    add-int/lit8 p2, p2, -0x1

    invoke-virtual {p1, p3, p2}, Lcom/facebook/react/views/image/h;->p(FI)V

    :goto_0
    return-void
.end method

.method public setBorderWidth(Lcom/facebook/react/views/image/h;F)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "borderWidth"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setBorderWidth(F)V

    return-void
.end method

.method public setDefaultSource(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "defaultSrc"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setDefaultSource(Ljava/lang/String;)V

    return-void
.end method

.method public setFadeDuration(Lcom/facebook/react/views/image/h;I)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "fadeDuration"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setFadeDuration(I)V

    return-void
.end method

.method public setHeaders(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "headers"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setHeaders(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public setInternal_AnalyticsTag(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "internal_analyticTag"
    .end annotation

    return-void
.end method

.method public setLoadHandlersRegistered(Lcom/facebook/react/views/image/h;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "shouldNotifyLoadEvents"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setShouldNotifyLoadEvents(Z)V

    return-void
.end method

.method public setLoadingIndicatorSource(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "loadingIndicatorSrc"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setLoadingIndicatorSource(Ljava/lang/String;)V

    return-void
.end method

.method public setOverlayColor(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V
    .locals 0
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "overlayColor"
    .end annotation

    if-nez p2, :cond_0

    const/4 p2, 0x0

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setOverlayColor(I)V

    goto :goto_1

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    goto :goto_0

    :goto_1
    return-void
.end method

.method public setProgressiveRenderingEnabled(Lcom/facebook/react/views/image/h;Z)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "progressiveRenderingEnabled"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setProgressiveRenderingEnabled(Z)V

    return-void
.end method

.method public setResizeMethod(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "resizeMethod"
    .end annotation

    if-eqz p2, :cond_3

    const-string v0, "auto"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, "resize"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p2, Lcom/facebook/react/views/image/c;->n:Lcom/facebook/react/views/image/c;

    :goto_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setResizeMethod(Lcom/facebook/react/views/image/c;)V

    goto :goto_2

    :cond_1
    const-string v0, "scale"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p2, Lcom/facebook/react/views/image/c;->o:Lcom/facebook/react/views/image/c;

    goto :goto_0

    :cond_2
    sget-object v0, Lcom/facebook/react/views/image/c;->m:Lcom/facebook/react/views/image/c;

    invoke-virtual {p1, v0}, Lcom/facebook/react/views/image/h;->setResizeMethod(Lcom/facebook/react/views/image/c;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid resize method: \'"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\'"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "ReactNative"

    invoke-static {p2, p1}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    :goto_1
    sget-object p2, Lcom/facebook/react/views/image/c;->m:Lcom/facebook/react/views/image/c;

    goto :goto_0

    :goto_2
    return-void
.end method

.method public setResizeMode(Lcom/facebook/react/views/image/h;Ljava/lang/String;)V
    .locals 1
    .annotation runtime Lx2/a;
        name = "resizeMode"
    .end annotation

    invoke-static {p2}, Lcom/facebook/react/views/image/d;->c(Ljava/lang/String;)Lj1/p$b;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/facebook/react/views/image/h;->setScaleType(Lj1/p$b;)V

    invoke-static {p2}, Lcom/facebook/react/views/image/d;->d(Ljava/lang/String;)Landroid/graphics/Shader$TileMode;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setTileMode(Landroid/graphics/Shader$TileMode;)V

    return-void
.end method

.method public setResizeMultiplier(Lcom/facebook/react/views/image/h;F)V
    .locals 2
    .annotation runtime Lx2/a;
        name = "resizeMultiplier"
    .end annotation

    const v0, 0x3c23d70a    # 0.01f

    cmpg-float v0, p2, v0

    if-gez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid resize multiplier: \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, "\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReactNative"

    invoke-static {v1, v0}, LP0/a;->G(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setResizeMultiplier(F)V

    return-void
.end method

.method public setSource(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "source"
    .end annotation

    invoke-virtual {p1, p2}, Lcom/facebook/react/views/image/h;->setSource(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setSrc(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0
    .annotation runtime Lx2/a;
        name = "src"
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/facebook/react/views/image/ReactImageManager;->setSource(Lcom/facebook/react/views/image/h;Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public setTintColor(Lcom/facebook/react/views/image/h;Ljava/lang/Integer;)V
    .locals 1
    .annotation runtime Lx2/a;
        customType = "Color"
        name = "tintColor"
    .end annotation

    if-nez p2, :cond_0

    invoke-virtual {p1}, Landroid/widget/ImageView;->clearColorFilter()V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    sget-object v0, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p1, p2, v0}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    :goto_0
    return-void
.end method
