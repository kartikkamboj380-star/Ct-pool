.class public final synthetic Lh4/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lh4/A;


# direct methods
.method public synthetic constructor <init>(Lh4/A;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh4/v;->a:Lh4/A;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lh4/v;->a:Lh4/A;

    invoke-static {v0}, Lh4/A;->b(Lh4/A;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
