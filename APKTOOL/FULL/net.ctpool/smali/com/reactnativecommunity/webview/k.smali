.class public abstract Lcom/reactnativecommunity/webview/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:LF5/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LF5/f;

    const-string v1, "[\\\\/%\"]"

    invoke-direct {v0, v1}, LF5/f;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/reactnativecommunity/webview/k;->a:LF5/f;

    return-void
.end method

.method public static final a()LF5/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/reactnativecommunity/webview/k;->a:LF5/f;

    .line 2
    .line 3
    return-object v0
.end method
