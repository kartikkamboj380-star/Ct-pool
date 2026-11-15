.class public final synthetic LY3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LY3/f$a;


# instance fields
.field public final synthetic a:LY3/f;


# direct methods
.method public synthetic constructor <init>(LY3/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LY3/e;->a:LY3/f;

    return-void
.end method


# virtual methods
.method public final onBackgroundStateChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LY3/e;->a:LY3/f;

    invoke-static {v0, p1}, LY3/f;->a(LY3/f;Z)V

    return-void
.end method
