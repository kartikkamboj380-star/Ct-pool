.class Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tenjin/android/utils/TenjinStartup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PlatformParameterWrapper"
.end annotation


# instance fields
.field private params:Lcom/tenjin/android/params/platform/PlatformParams;

.field final synthetic this$0:Lcom/tenjin/android/utils/TenjinStartup;


# direct methods
.method private constructor <init>(Lcom/tenjin/android/utils/TenjinStartup;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;->this$0:Lcom/tenjin/android/utils/TenjinStartup;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/tenjin/android/utils/TenjinStartup;Lcom/tenjin/android/utils/TenjinStartup$1;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;-><init>(Lcom/tenjin/android/utils/TenjinStartup;)V

    return-void
.end method


# virtual methods
.method public getParams()Lcom/tenjin/android/params/platform/PlatformParams;
    .locals 1

    iget-object v0, p0, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;->params:Lcom/tenjin/android/params/platform/PlatformParams;

    return-object v0
.end method

.method public setParams(Lcom/tenjin/android/params/platform/PlatformParams;)V
    .locals 0

    iput-object p1, p0, Lcom/tenjin/android/utils/TenjinStartup$PlatformParameterWrapper;->params:Lcom/tenjin/android/params/platform/PlatformParams;

    return-void
.end method
