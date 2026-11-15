.class public final synthetic Lb3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lc3/c;


# direct methods
.method public synthetic constructor <init>(Lc3/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/h;->a:Lc3/c;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb3/h;->a:Lc3/c;

    invoke-interface {v0}, Lc3/c;->d()LX2/a;

    move-result-object v0

    return-object v0
.end method
