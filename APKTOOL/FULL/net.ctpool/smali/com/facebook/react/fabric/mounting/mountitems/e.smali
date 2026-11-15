.class public final Lcom/facebook/react/fabric/mounting/mountitems/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lcom/facebook/react/fabric/mounting/mountitems/e;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lcom/facebook/react/fabric/mounting/mountitems/e;

    invoke-direct {v0}, Lcom/facebook/react/fabric/mounting/mountitems/e;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/e;->a:Lcom/facebook/react/fabric/mounting/mountitems/e;

    const-string v0, "View"

    const-string v1, "RCTView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v2

    const-string v0, "Image"

    const-string v1, "RCTImageView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v3

    const-string v0, "ScrollView"

    const-string v1, "RCTScrollView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v4

    const-string v0, "Slider"

    const-string v1, "RCTSlider"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v5

    const-string v0, "ModalHostView"

    const-string v1, "RCTModalHostView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v6

    const-string v0, "Paragraph"

    const-string v1, "RCTText"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v7

    const-string v0, "Text"

    const-string v1, "RCText"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v8

    const-string v0, "RawText"

    const-string v1, "RCTRawText"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v9

    const-string v0, "ActivityIndicatorView"

    const-string v1, "AndroidProgressBar"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v10

    const-string v0, "ShimmeringView"

    const-string v1, "RKShimmeringView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v11

    const-string v0, "TemplateView"

    const-string v1, "RCTTemplateView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v12

    const-string v0, "AxialGradientView"

    const-string v1, "RCTAxialGradientView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v13

    const-string v0, "Video"

    const-string v1, "RCTVideo"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v14

    const-string v0, "Map"

    const-string v1, "RCTMap"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v15

    const-string v0, "WebView"

    const-string v1, "RCTWebView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v16

    const-string v0, "Keyframes"

    const-string v1, "RCTKeyframes"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v17

    const-string v0, "ImpressionTrackingView"

    const-string v1, "RCTImpressionTrackingView"

    invoke-static {v0, v1}, Li5/q;->a(Ljava/lang/Object;Ljava/lang/Object;)Li5/l;

    move-result-object v18

    filled-new-array/range {v2 .. v18}, [Li5/l;

    move-result-object v0

    invoke-static {v0}, Lj5/F;->i([Li5/l;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lcom/facebook/react/fabric/mounting/mountitems/e;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "componentName"

    invoke-static {p0, v0}, Lw5/k;->f(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/facebook/react/fabric/mounting/mountitems/e;->b:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    return-object p0
.end method
