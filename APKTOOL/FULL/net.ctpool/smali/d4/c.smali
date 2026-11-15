.class public final synthetic Ld4/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/a$a;


# instance fields
.field public final synthetic a:Ld4/d;


# direct methods
.method public synthetic constructor <init>(Ld4/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/c;->a:Ld4/d;

    return-void
.end method


# virtual methods
.method public final a(LD4/b;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/c;->a:Ld4/d;

    invoke-static {v0, p1}, Ld4/d;->a(Ld4/d;LD4/b;)V

    return-void
.end method
