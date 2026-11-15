.class public interface abstract Lcom/facebook/react/fabric/ReactNativeConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LR1/a;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/fabric/ReactNativeConfig$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/facebook/react/fabric/ReactNativeConfig$a;

.field public static final b:Lcom/facebook/react/fabric/ReactNativeConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/facebook/react/fabric/ReactNativeConfig$a;->a:Lcom/facebook/react/fabric/ReactNativeConfig$a;

    sput-object v0, Lcom/facebook/react/fabric/ReactNativeConfig;->a:Lcom/facebook/react/fabric/ReactNativeConfig$a;

    new-instance v0, Lcom/facebook/react/fabric/EmptyReactNativeConfig;

    invoke-direct {v0}, Lcom/facebook/react/fabric/EmptyReactNativeConfig;-><init>()V

    sput-object v0, Lcom/facebook/react/fabric/ReactNativeConfig;->b:Lcom/facebook/react/fabric/ReactNativeConfig;

    return-void
.end method


# virtual methods
.method public abstract getBool(Ljava/lang/String;)Z
    .annotation build LR1/a;
    .end annotation
.end method

.method public abstract getDouble(Ljava/lang/String;)D
    .annotation build LR1/a;
    .end annotation
.end method

.method public abstract getInt64(Ljava/lang/String;)J
    .annotation build LR1/a;
    .end annotation
.end method

.method public abstract getString(Ljava/lang/String;)Ljava/lang/String;
    .annotation build LR1/a;
    .end annotation
.end method
