.class public final synthetic Lb3/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld3/b$a;


# instance fields
.field public final synthetic a:Lb3/r;


# direct methods
.method public synthetic constructor <init>(Lb3/r;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb3/o;->a:Lb3/r;

    return-void
.end method


# virtual methods
.method public final f()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lb3/o;->a:Lb3/r;

    invoke-static {v0}, Lb3/r;->c(Lb3/r;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
